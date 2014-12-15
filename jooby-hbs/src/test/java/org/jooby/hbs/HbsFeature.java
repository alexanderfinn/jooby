package org.jooby.hbs;

import static org.junit.Assert.assertEquals;

import org.apache.http.client.fluent.Request;
import org.jooby.View;
import org.jooby.test.ServerFeature;
import org.junit.Test;

public class HbsFeature extends ServerFeature {

  {
    use(new Hbs());

    get("/", req -> View.of("index", req.param("model").stringValue()));
  }

  @Test
  public void hbs() throws Exception {
    assertEquals("<html><body>jooby</body></html>",
        Request.Get(uri("/").addParameter("model", "jooby").build()).execute()
            .returnContent().asString());
  }

}
