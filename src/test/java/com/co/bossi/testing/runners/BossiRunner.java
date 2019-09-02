package com.co.bossi.testing.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/com/co/bossi/testing/features/BuscarCalzado.feature",
glue ="com.co.bossi.testing.stepsdefinitions",
snippets = SnippetType.CAMELCASE)

public class BossiRunner {

}
