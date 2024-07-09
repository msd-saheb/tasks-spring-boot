package com.amdee.io.homeworks.homework2.advice;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class DepartmentApiResponse<T> {

    private T data;

    private LocalDateTime timeStamps;

    private DepartmentApiError error;

    public DepartmentApiResponse(){
      this.timeStamps = LocalDateTime.now();
    }

    public DepartmentApiResponse(T data){
       this();
       this.data = data;
    }

    public DepartmentApiResponse(DepartmentApiError error){
       this();
       this.error = error;
    }
}
