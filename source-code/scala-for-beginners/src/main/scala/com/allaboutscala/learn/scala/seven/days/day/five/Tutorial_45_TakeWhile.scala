package com.allaboutscala.learn.scala.seven.days.day.five

/**
  * Created by Nadim Bahadoor on 15/10/2018.
  *
  * The content was inspired by the original tutorial below, and feedback from readers at http://allaboutscala.com.
  *
  * Tutorial: Learn How To Use TakeWhile Function With Examples
  *
  * [[http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-takewhile-example/ Tutorial]]
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
object Tutorial_45_TakeWhile extends App {

  println("Step 1: How to initialize a List of donuts")
  val donuts = List("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")



  println("\nStep 2: How to take elements from the List using the takeWhile function")
  println(s"Take donut elements which start with letter P = ${donuts.takeWhile(_.charAt(0) == 'P')}")



  println("\nStep 3: How to declare a predicate function to be passed-through to the takeWhile function")
  val takeDonutPredicate: (String) => Boolean = (donutName) => donutName.charAt(0) == 'P'


  println("\nStep 4: How to take elements using the predicate function from Step 3")
  println(s"Take elements using function from Step 3 = ${donuts.takeWhile(takeDonutPredicate)}")
}
