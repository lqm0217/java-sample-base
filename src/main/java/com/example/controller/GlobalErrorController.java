package com.example.controller;

import java.util.Collections;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class GlobalErrorController extends BasicErrorController {

  private final ErrorAttributes errorAttributes;

  public GlobalErrorController(ServerProperties serverProperties) {
    super(new DefaultErrorAttributes(), serverProperties.getError());
    this.errorAttributes = new DefaultErrorAttributes();
  }

  @Override
  @RequestMapping(produces = "text/html")
  public ModelAndView errorHtml(HttpServletRequest request,
      HttpServletResponse response) {

    printErrorInformation(request);

    HttpStatus status = getStatus(request);
    Map<String, Object> model = Collections.unmodifiableMap(getErrorAttributes(
        request, isIncludeStackTrace(request, MediaType.TEXT_HTML)));

    response.setStatus(status.value());

    String requestURI = (String) request.getAttribute("javax.servlet.forward.request_uri");
    Site site = Site.of(requestURI);

    return new ModelAndView(site.getBaseUrl() + "/error", model);
  }

  @Override
  @RequestMapping
  @ResponseBody
  public ResponseEntity<Map<String, Object>> error(HttpServletRequest request) {
    printErrorInformation(request);

    Map<String, Object> body = getErrorAttributes(request,
        isIncludeStackTrace(request, MediaType.ALL));
    HttpStatus status = getStatus(request);
    return new ResponseEntity<>(body, status);
  }

  private void printErrorInformation(HttpServletRequest request) {
    WebRequest webRequest = new ServletWebRequest(request);
    Throwable e = errorAttributes.getError(webRequest);
    log.error("Global Error Handler: Message:[{}]", e.getMessage());
  }

}