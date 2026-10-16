package org.springlecture;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//3. create class
//4. apply annotations
@ComponentScan
@Configuration
public class AppConfig { //5. AppConfig - object is also a bean managed by ioc - AppConfig uses @Component internally - but a special class
}
