/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psp05;

/**
 * ****************************************************************************
 * clase no instanciable donde se definen algunos valores finales
 *
 * @author IMCG
 */
public class Paginas {

  public static final String primeraCabecera =
          "Content-Type:text/html;charset=UTF-8";
  //contenido index
  public static final String html_index = "<html>"
          + "<head><title>index</title></head>"
          + "<body>"
          + "<h1>&iexcl;Enhorabuena!</h1>"
          + "<p>Tu servidor HTTP m&iacute;nimo funciona correctamente</p>"
          + "</body>"
          + "</html>";
  //contenido quijote
  public static final String html_quijote = "<html>"
          + "<head><title>quijote</title></head>"
          + "<body>"
          + "<h1>As&iacute; comienza el Quijote</h1>"
          + "<p>En un lugar de la Mancha, de cuyo nombre no quiero "
          + "acordarme, no ha mucho tiempo que viv&iacute;a un hidalgo de los "
          + "de lanza en astillero, adarga antigua, roc&iacute;n flaco y galgo "
          + "corredor. Una olla de algo m&aacute;s vaca que carnero, salpic&oacute;n "
          + "las m&aacute;s noches, duelos y quebrantos (huevos con tocino) los "
          + "s&aacute;bados, lentejas los viernes, alg&uacute;n palomino de a&ntilde;adidura "
          + "los domingos, consum&iacute;an las tres partes de su hacienda. El "
          + "resto della conclu&iacute;an sayo de velarte (traje de pa&ntilde;o fino), "
          + "calzas de velludo (terciopelo) para las fiestas con sus "
          + "pantuflos de lo mismo, y los d&iacute;as de entresemana se honraba "
          + "con su vellor&iacute; (pardo de pa&ntilde;o) de lo m&aacute;s fino. Ten&iacute;a en su "
          + "casa una ama que pasaba de los cuarenta, y una sobrina que "
          + "no llegaba a los veinte, y un mozo de campo y plaza, que "
          + "as&iacute; ensillaba el roc&iacute;n como tomaba la podadera...</p>"
          + "</body>"
          + "</html>";
  //contenido noEncontrado
  public static final String html_noEncontrado = "<html>"
          + "<head><title>noEncontrado</title></head>"
          + "<body>"
          + "<h1>&iexcl;ERROR! P&aacute;gina no encontrada</h1>"
          + "<p>La p&aacute;gina que solicitaste no existe en nuestro "
          + "servidor</p>"
          + "</body>"
          + "</html>";
}
