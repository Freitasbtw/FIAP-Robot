package Repeticao;

import java.util.Scanner;

public class Sprint_Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
		int passos = 0, potencia = 0, distancia = 0, potUsada = 0, potRestante = 0;
		String direcao;

		System.out.println("Seja muito bem vindo ao labirinto do robô!!");
		System.out.println("Digite a potência: ");
		potencia = e.nextInt();
		while (potencia < 98) {
			System.out.println("Potência insuficiente, por favor digite um número maior.");
			potencia = e.nextInt();
		}
		System.out.println("Robô carregado com: " + potencia);
		System.out.println("Vamos lá!!");
		System.out.println("Digite a direção que o robô vai andar: ");
		System.out.println("Frente - Trás - Direita - Esquerda");
		direcao = e.next();
		while(!(direcao.equalsIgnoreCase("Frente") || direcao.equalsIgnoreCase("Tras") || direcao.equalsIgnoreCase("Direita") || direcao.equalsIgnoreCase("Esquerda"))) {
		    System.out.println("Digite uma direção válida: ");
		    direcao = e.next();
		}

		if (direcao.equalsIgnoreCase("frente")) {
			System.out.println("Quantos passos o robô vai dar?");
			passos = e.nextInt();
			distancia = distancia+passos;
			if (passos == 5) {
				System.out.println("Você completou a 1º Etapa");
				System.out.println("Digite a direção que o robô vai andar: ");
				direcao = e.next();
				while(!(direcao.equalsIgnoreCase("Frente") || direcao.equalsIgnoreCase("Tras") || direcao.equalsIgnoreCase("Direita") || direcao.equalsIgnoreCase("Esquerda"))) {
				    System.out.println("Digite uma direção válida: ");
				    direcao = e.next();
				}
				if (direcao.equalsIgnoreCase("esquerda")) {
					System.out.println("Quantos passos o robô vai dar?");
					passos = e.nextInt();
					distancia = distancia+passos;
					if (passos == 7) {
						System.out.println("Você completou a 2º Etapa");
						System.out.println("Digite a direção que o robô vai andar: ");
						direcao = e.next();
						while(!(direcao.equalsIgnoreCase("Frente") || direcao.equalsIgnoreCase("Tras") || direcao.equalsIgnoreCase("Direita") || direcao.equalsIgnoreCase("Esquerda"))) {
						    System.out.println("Digite uma direção válida: ");
						    direcao = e.next();
						}
						if (direcao.equalsIgnoreCase("frente")) {
							System.out.println("Quantos passos o robô vai dar?");
							passos = e.nextInt();
							distancia = distancia+passos;
							if (passos == 7) {
								System.out.println("Você completou a 3º Etapa");
								System.out.println("Digite a direção que o robô vai andar: ");
								direcao = e.next();
								while(!(direcao.equalsIgnoreCase("Frente") || direcao.equalsIgnoreCase("Tras") || direcao.equalsIgnoreCase("Direita") || direcao.equalsIgnoreCase("Esquerda"))) {
								    System.out.println("Digite uma direção válida: ");
								    direcao = e.next();
								}
								if (direcao.equalsIgnoreCase("direita")) {
									System.out.println("Quantos passos o robô vai dar?");
									passos = e.nextInt();
									distancia = distancia+passos;
									if (passos == 11) {
										System.out.println("Você completou a 4º Etapa");
										System.out.println("Digite a direção que o robô vai andar: ");
										direcao = e.next();
										while(!(direcao.equalsIgnoreCase("Frente") || direcao.equalsIgnoreCase("Tras") || direcao.equalsIgnoreCase("Direita") || direcao.equalsIgnoreCase("Esquerda"))) {
										    System.out.println("Digite uma direção válida: ");
										    direcao = e.next();
										}
										distancia = distancia+passos;
										if (direcao.equalsIgnoreCase("frente")) {
											System.out.println("Quantos passos o robô vai dar?");
											passos = e.nextInt();
											if (passos == 8) {
												System.out.println("Você completou a 5º Etapa");
												System.out.println("Digite a direção que o robô vai andar: ");
												direcao = e.next();
												while(!(direcao.equalsIgnoreCase("Frente") || direcao.equalsIgnoreCase("Tras") || direcao.equalsIgnoreCase("Direita") || direcao.equalsIgnoreCase("Esquerda"))) {
												    System.out.println("Digite uma direção válida: ");
												    direcao = e.next();
												}
												if (direcao.equalsIgnoreCase("esquerda")) {
													System.out.println("Quantos passos o robô vai dar?");
													passos = e.nextInt();
													distancia = distancia+passos;
													if (passos == 8) {
														System.out.println("Você completou a 6º Etapa");
														System.out.println("Digite a direção que o robô vai andar: ");
														direcao = e.next();
														while(!(direcao.equalsIgnoreCase("Frente") || direcao.equalsIgnoreCase("Tras") || direcao.equalsIgnoreCase("Direita") || direcao.equalsIgnoreCase("Esquerda"))) {
														    System.out.println("Digite uma direção válida: ");
														    direcao = e.next();
														}
														if (direcao.equalsIgnoreCase("frente")) {
															System.out.println("Quantos passos o robô vai dar?");
															passos = e.nextInt();
															distancia = distancia+passos;
															if (passos == 3) {
																System.out.println("Parabéns você chegou!!");
															} else {
																System.out.println("O robô bateu!");
															}
														} else {
															System.out.println("O robô bateu!");
														}
													} else {
														System.out.println("O robô bateu!");
													}
												} else {
													System.out.println("O robô bateu!");
												}
											} else {
												System.out.println("O robô bateu!");
											}
										} else {
											System.out.println("O robô bateu!");
										}
									} else {
										System.out.println("O robô bateu!");
									}
								} else {
									System.out.println("O robô bateu!");
								}
							} else {
								System.out.println("O robô bateu!");
							}
						} else {
							System.out.println("O robô bateu!");
						}
					} else {
						System.out.println("O robô bateu!");
					}
				} else {
					System.out.println("O robô bateu!");
				}
			} else {
				System.out.println("O robô bateu!");
			}
		} else {
			System.out.println("O robô bateu!");
		}
		potUsada = (distancia - 3) * 2 ;
		potRestante = potencia - potUsada;
		System.out.println("Potência usada: " + potUsada);
		System.out.println("Potência restante: " + potRestante);
	}
}