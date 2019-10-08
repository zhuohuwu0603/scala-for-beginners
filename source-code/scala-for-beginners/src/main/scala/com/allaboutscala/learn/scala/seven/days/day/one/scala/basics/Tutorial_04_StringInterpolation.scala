package com.allaboutscala.learn.scala.seven.days.day.one.scala.basics

/**
  * Created by Nadim Bahadoor on 15/10/2018.
  *
  * The content was inspired by the original tutorial below, and feedback from readers at http://allaboutscala.com.
  *
  * Tutorial: Scala String Interpolation – Print And Format Variables
  *
  * [[http://allaboutscala.com/tutorials/chapter-2-learning-basics-scala-programming/scala-string-interpolation-print-format-variables/ Tutorial]]
  *
  *
  * Copyright 2016 - 2019 Nadim Bahadoor (http://allaboutscala.com)
  *
  * Licensed under the Apache License, Version 2.0 (the "License"); you may not
  * use this file except in compliance with the License. You may obtain a copy of
  * the License at
  *
  *  [http://www.apache.org/licenses/LICENSE-2.0]
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  * License for the specific language governing permissions and limitations under
  * the License.
  */
object Tutorial_04_StringInterpolation extends App {

  println("Step 1: Using String interpolation to print a variable")
  val favoriteDonut = "Glazed Donut"
  println(s"My favorite donut = $favoriteDonut")



  println("\nStep 2: Using String interpolation on object properties")
  case class Donut(name: String, tasteLevel: String)

  val favoriteDonut2 = Donut("Glazed Donut", "Very Tasty")
  println(s"My favorite donut name = ${favoriteDonut2.name}, tasteLevel = ${favoriteDonut2.tasteLevel}")



  println("\nStep 3: Using String interpolation to evaluate expressions")
  val qtyDonutsToBuy = 10
  println(s"Are we buying 10 donuts = ${qtyDonutsToBuy == 10}")



  println("\nStep 4: Using String interpolation for formatting text")
  val donutName = "Vanilla Donut"
  val donutTasteLevel = "Tasty"
  println(f"$donutName%20s $donutTasteLevel")



  println("\nStep 5: Using f interpolation to format numbers")
  val donutPrice = 2.50
  println(s"Donut price = $donutPrice")
  println(f"Formatted donut price = $donutPrice%.2f")



  println("\nStep 6: Using raw interpolation")
  println(raw"Favorite donut\t$donutName")
}
