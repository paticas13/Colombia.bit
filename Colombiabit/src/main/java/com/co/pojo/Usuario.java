/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.co.pojo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author alfa4
 */
@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
    
    @Id
    private Integer Cedula;
    private String nombres;
    private String apellido;
    private String correoElectronico;
    private String telefono; //Cambiar a number
    private String contrasena;
    private Integer edad; //Cambiar a number
    private String foto; //Averiguar que tipo de dato en java tiene una relación con un tipo BLOB de BD
    private Integer cv; //Averiguar que tipo de dato en java tiene una relación con un tipo BLOB de BD
    private Integer id_Ramas; //posible modificación futura
}
