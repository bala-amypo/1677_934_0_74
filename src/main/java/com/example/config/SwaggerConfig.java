public class SwaggerConfig {
    public OpenAPI customOpenAPI() {
        .servers(List.of(
            new Server().url("https://9321.pro684cr.amypo.ai/")
        ));
    }
}