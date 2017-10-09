package org.kelsadita.webframeworks;

import org.kelsadita.webframeworks.controller.UserController;
import spark.Spark;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;


public class SparkApplication {

  public static void main(String[] args) {
    staticFileLocation("/public");

    Spark.get("/users", UserController::loadUsers, new ThymeleafTemplateEngine());
  }
}

