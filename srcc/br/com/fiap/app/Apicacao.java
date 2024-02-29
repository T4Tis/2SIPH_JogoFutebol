package br.com.fiap.app;

import java.util.Random;

import br.com.fiap.model.Partida;
import br.com.fiap.model.time;

public class Apicacao {

	public static void main(String[] args) {
	
		time sp = new time();
		sp.setNome("São Paulo");
		
		time cor = new time();
		cor.setNome("Corintias");
		
		time pal = new time();
		pal.setNome("Palmeiras");
		
		time juv = new time();
		juv.setNome("Juventos");
		
		Random rand = new Random();
		
		int gV = rand.nextInt(10);
		int gC = rand.nextInt(10);
		Partida p1 = new Partida(sp , cor, gC, gV);

		gV = rand.nextInt(10);
		gC = rand.nextInt(10);
		Partida p2 = new Partida(sp , pal, gC, gV);
		
		gV = rand.nextInt(10);
		gC = rand.nextInt(10);
		Partida p3 = new Partida(sp , juv, gC, gV);
		
		gV = rand.nextInt(10);
		gC = rand.nextInt(10);
		Partida p4 = new Partida(cor , pal, gC, gV);
		
		gV = rand.nextInt(10);
		gC = rand.nextInt(10);
		Partida p5 = new Partida(cor , juv, gC, gV);
		
		gV = rand.nextInt(10);
		gC = rand.nextInt(10);
		Partida p6 = new Partida(juv , pal , gC, gV);
		
		System.out.println(sp.getNome() + " "+ sp.getPontos());
		System.out.println(cor.getNome() + " "+ sp.getPontos());
		System.out.println(pal.getNome() + " "+ sp.getPontos());
		System.out.println(juv.getNome() + " "+ sp.getPontos());
		

	}

}
