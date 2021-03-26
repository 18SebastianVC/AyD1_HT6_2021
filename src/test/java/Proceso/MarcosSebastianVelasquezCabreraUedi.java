/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;




public class MarcosSebastianVelasquezCabreraUedi {
    
    @InjectMocks
    private AsignarHorario horario;

    @Mock
    private RegistroAcademico registroAcademico;

    @Mock
    private Carrera carrera;
    
    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void addCodhorario() throws Exception{
            when(registroAcademico.cheequearCarnet()).thenReturn(true);
            when(carrera.procesarCarrera()).thenReturn(1);
            when(registroAcademico.getAnio()).thenReturn(2016);
            
            horario = new AsignarHorario();
            
             assertEquals(414,horario.generarHorario(carrera,registroAcademico).getCodigoHorario());
    }

    @Test
    public void addCarrera() throws Exception{
    	when(registroAcademico.cheequearCarnet()).thenReturn(true);
    	when(carrera.procesarCarrera()).thenReturn(1);
    	when(registroAcademico.getAnio()).thenReturn(ArgumentMatchers.anyInt());

    	horario = new AsignarHorario();

    	assertEquals("Mixto", horario.generarHorario(carrera,registroAcademico).getDescripcion());

    }
}