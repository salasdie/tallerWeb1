package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorSaludo {

    @RequestMapping(path = "/saludar")
    public ModelAndView saludar(@RequestParam(value = "nombre") String nombreUsuario,
                                @RequestParam(value = "otro_nombre") String otroUsuario){
        ModelMap modelo = new ModelMap();

        modelo.put("saludo", "Hola");
        modelo.put("nombre", nombreUsuario);
        modelo.put("otroUsuario", otroUsuario);
        modelo.put("pregunta", "como estan?");

        return new ModelAndView("saludo", modelo);
    }
    @RequestMapping(path = "/saludar/{nombre}")
    public ModelAndView otraFormaDeSaludar(@PathVariable String nombre){
        ModelMap modelo = new ModelMap();

        modelo.put("saludo", "Hola");
        modelo.put("nombre", nombre);
        modelo.put("pregunta", "como estas?");

        return new ModelAndView("saludo", modelo);
    }

}



