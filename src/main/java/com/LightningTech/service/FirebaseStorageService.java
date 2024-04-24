/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.LightningTech.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author harly
 */

@Service
public interface FirebaseStorageService {
    
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    final String BucketName = "lightning-technologies.appspot.com";

    final String rutaSuperiorStorage = "lightning-technologies";

    final String rutaJsonFile = "firebase";

    //El nombre del archivo Json
    final String archivoJsonFile = "lightning-technologies-firebase-adminsdk-pxf5t-b1c2e0c513.json";
    
}
