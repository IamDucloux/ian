package org.unitec;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ian on 2/12/16.
 */
@RestController

public class ControladorInicial {
    @RequestMapping("/hola")
public String ian(){
        return "MI primer servicio web";
    }
}
