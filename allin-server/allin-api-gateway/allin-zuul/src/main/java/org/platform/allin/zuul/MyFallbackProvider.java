//package org.platform.allin.zuul;
//
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.client.ClientHttpResponse;
//import org.springframework.stereotype.Component;
//@Slf4j
//@Component
//public class MyFallbackProvider implements FallbackProvider {
//    @Override
//    public String getRoute() {
//        return "allin-consumer";
//    }
//
//    @Override
//    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
//        log.info("route:"+route);
//        log.info("exception:"+cause.getMessage());
//        return new ClientHttpResponse() {
//            @Override
//            public HttpStatus getStatusCode() throws IOException {
//                return HttpStatus.OK;
//            }
//
//            @Override
//            public int getRawStatusCode() throws IOException {
//                return 200;
//            }
//
//            @Override
//            public String getStatusText() throws IOException {
//                return "ok";
//            }
//
//            @Override
//            public void close() {
//
//            }
//
//            @Override
//            public InputStream getBody() throws IOException {
//                return new ByteArrayInputStream("Sorry, the service is unavailable now.".getBytes());
//            }
//
//            @Override
//            public HttpHeaders getHeaders() {
//                HttpHeaders headers = new HttpHeaders();
//                headers.setContentType(MediaType.APPLICATION_JSON);
//                return headers;
//            }
//        };
//    }
//}