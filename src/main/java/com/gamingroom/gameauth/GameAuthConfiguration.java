package com.gamingroom.gameauth;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.client.HttpClientConfiguration;
import io.dropwizard.client.JerseyClientConfiguration;

import io.dropwizard.Configuration;
import javax.validation.constraints.*;

public class GameAuthConfiguration extends Configuration {

	  @NotNull
	  private HttpClientConfiguration httpClient = new HttpClientConfiguration();

	  @JsonProperty("httpClient")
	  public HttpClientConfiguration getHttpClientConfiguration() {
	    return httpClient;
	  }

	  @JsonProperty("httpClient")
	  public void setHttpClientConfiguration(HttpClientConfiguration httpClient) {
	    this.httpClient = httpClient;
	  }

	  @NotNull
	  private JerseyClientConfiguration jerseyClient = new JerseyClientConfiguration();

	  @JsonProperty("jerseyClient")
	  public JerseyClientConfiguration getJerseyClientConfiguration() {
	    return jerseyClient;
	  }

	  @JsonProperty("jerseyClient")
	  public void setJerseyClientConfiguration(JerseyClientConfiguration jerseyClient) {
	    this.jerseyClient = jerseyClient;
	  }

}