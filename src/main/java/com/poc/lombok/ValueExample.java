package com.poc.lombok;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ValueExample {
    String name;
    String id;
}
