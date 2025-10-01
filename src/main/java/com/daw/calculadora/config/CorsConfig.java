package com.daw.calculadora.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Aplica a todos los endpoints

                // 1. ORIGEN: Asegúrate de que tu puerto de Vue esté aquí (ej. 5173 o 3000)
                .allowedOrigins("http://localhost:5173", "http://localhost:3000")

                // 2. MÉTODOS: Incluye POST y OPTIONS (necesario para el pre-flight request)
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")

                // 3. CABECERAS: Es crucial permitir todas las cabeceras
                .allowedHeaders("*");
    }
}