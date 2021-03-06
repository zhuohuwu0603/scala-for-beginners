package com.allaboutscala.learn.scala.seven.days.day.one.familiar

/**
  * Created by Nadim Bahadoor on 15/10/2018.
  *
  * The content was inspired by the original tutorial below, and feedback from readers at http://allaboutscala.com.
  *
  * Tutorial: IntelliJ Run Configuration - Running your Scala application
  *
  * [http://allaboutscala.com/tutorials/chapter-1-getting-familiar-intellij-ide/intellij-run-configuration-scala-application/ Tutorial
  *
  *
  * Tutorial: Where is the main method to launch Scala application
  *
  * [[http://allaboutscala.com/tutorials/chapter-1-getting-familiar-intellij-ide/where-is-main-method-launch-scala-application/ Tutorial]]
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
object Tutorial_02_HelloWorldWithArguments extends App {

  println("Hello World from http://allaboutscala.com")

  println(args.mkString(", "))
}
