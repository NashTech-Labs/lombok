package com.poc.lombok;

import lombok.*;

/*@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String id;
    private String name;
}*/
@Data
@Builder
public class Employee {
    private String id;
    private String name;
}
