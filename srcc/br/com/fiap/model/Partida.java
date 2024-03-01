package br.com.fiap.model;

public class Partida {

	private time casa;
	
	private time visitante;
	
	int golsCasa;
	
	int golsVisitate;

	public Partida(time casa, time visitante, int golsCasa, int golsVisitate) {
		
		this.casa = casa;
		this.visitante = visitante;
		this.golsCasa = golsCasa;
		this.golsVisitate = golsVisitate;
		
		if (golsCasa > golsVisitate) {
			//int pts = this.casa.getPontos();
			//this.casa.setPontos(pts+3 );
			this.casa.addVitoria();
			
		}else if (golsCasa < golsVisitate) {
			//int pts = this.visitante.getPontos();
			//this.visitante.setPontos(pts+3);
			this.visitante.addVitoria();
		}else {
			//int ptsC = this.casa.getPontos()+1;
			//int ptsV = this.visitante.getPontos()+1;
			//this.casa.setPontos(ptsC);
			//this.casa.setPontos(ptsV);
			this.casa.addEmpante();
			this.visitante.addEmpante();
		}
		
	}
}
