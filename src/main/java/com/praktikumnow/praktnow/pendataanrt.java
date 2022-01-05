/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikumnow.praktnow;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pendataanrt")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class pendataanrt {

    @Id
    private String Nama;
    private String KTP;
    private String Alamat;
    private String Status;
}
