package mx.edu.utez.aweb.pokemonapp2.controller;


import mx.edu.utez.aweb.pokemonapp2.model.pokemon.BeanPokemon;
import mx.edu.utez.aweb.pokemonapp2.service.pokemon.ServicePokemon;
import mx.edu.utez.aweb.pokemonapp2.utils.ResultAction;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name="ServletPokemon",
urlPatterns = {
        "/get-pokemons",
        "/add-pokemon",
        "/create-pokemon",
        "/update-pokemon",
        "/get-pokemon"
        })
public class ServletPokemon extends HttpServlet {
    Logger logger = Logger.getLogger("ServletPokemon");
    String action;
    String urlRedirect = "/get-pokemons";
    ServicePokemon servicePokemon = new ServicePokemon();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        action = request.getServletPath();
        logger.log(Level.INFO, "Path ->" + action);
        switch (action) {
            case "/get-pokemons":
                List<BeanPokemon> pokemons = servicePokemon.getAll();
                System.out.println(pokemons.size());
                request.setAttribute("pokemons", servicePokemon.getAll());
                urlRedirect = "/views/pokemon/index.jsp";
                break;

            case "/create-pokemon":
                urlRedirect = "/views/pokemon/create.jsp";
                break;

            case "/get-pokemon":
                String id = request.getParameter("id");
                id = (id==null) ? "0" : id;
                try{
                    BeanPokemon pokemon = servicePokemon.getPokemon(Long.parseLong(id));
                    request.setAttribute("pokemon", pokemon);
                    urlRedirect = "/views/pokemon/update.jsp";

                }catch (Exception e){
                    urlRedirect = "/get-pokemons";
                }

                break;

            default:
                request.setAttribute("pokemons", servicePokemon.getAll());
                urlRedirect = "/get-pokemons";
                break;
        }
        request.getRequestDispatcher(urlRedirect).forward(request, response);
    }
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
                request.setCharacterEncoding("UTF-8");
                request.setCharacterEncoding("UTF-8");
                response.setContentType("text/html");
                action = request.getServletPath();

                switch (action) {
                    case "/add-pokemon":
                        String nombre = request.getParameter("name");
                        String salud = request.getParameter("health");
                        String poder = request.getParameter("power");
                        String peso = request.getParameter("weight");
                        String altura = request.getParameter("height");
                        String tipo = request.getParameter("pokemonType");

                        BeanPokemon pokemon = new BeanPokemon();
                        pokemon.setName(nombre);
                        pokemon.setHealth(Double.parseDouble(salud));
                        pokemon.setPower(Double.parseDouble(poder));
                        pokemon.setWeight(Double.parseDouble(peso));
                        pokemon.setHeight(Double.parseDouble(altura));
                        pokemon.setPokemonType(tipo);
                        ResultAction result = servicePokemon.save(pokemon);
                        urlRedirect = "/get-pokemons?result="+
                                result.isResult()+"&message="+result.getMessage()+
                                "&status="+result.getStatus();
                        break;

                    case "/save-pokemon":
                        String id = request.getParameter("id");
                        String nombre2 = request.getParameter("name");
                        String salud2 = request.getParameter("health");
                        String poder2 = request.getParameter("power");
                        String peso2 = request.getParameter("weight");
                        String altura2 = request.getParameter("height");
                        String tipo2 = request.getParameter("pokemonType");

                        BeanPokemon pokemon2 = new BeanPokemon();
                        pokemon2.setName(nombre2);
                        pokemon2.setHealth(Double.parseDouble(salud2));
                        pokemon2.setPower(Double.parseDouble(poder2));
                        pokemon2.setWeight(Double.parseDouble(peso2));
                        pokemon2.setHeight(Double.parseDouble(altura2));
                        pokemon2.setPokemonType(tipo2);
                        ResultAction result2 = servicePokemon.save(pokemon2);
                        urlRedirect = "/get-pokemons?result="+
                                result2.isResult()+"&message="+result2.getMessage()+
                                "&status="+result2.getStatus();

                    default:
                        urlRedirect = "/get-pokemons";
                        break;
                }
                response.sendRedirect(request.getContextPath() + urlRedirect);
            }
        }

