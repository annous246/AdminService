package com.example.pointManagement.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class ResponseModel {
    String response;
    Boolean error = true;
    Object data;

}
