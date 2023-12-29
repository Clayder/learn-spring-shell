package br.clayder.learn.springshell

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringshellApplication

fun main(args: Array<String>) {
	runApplication<SpringshellApplication>(*args)
}
