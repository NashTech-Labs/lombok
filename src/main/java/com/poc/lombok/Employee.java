package com.poc.lombok;

import lombok.*;

@Data
@Builder
public class Employee {
    private String id;
    private String name;
}
