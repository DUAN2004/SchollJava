package org.example;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author 杰~
 * @version 1.0
 */
@Data
public class words {
    private String word;
    private String username;
    private LocalDateTime addTime;
    private LocalDateTime updateTime;


}
