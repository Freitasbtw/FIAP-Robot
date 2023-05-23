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
				while (potencia < 10) {
					System.out.println("Sua bateria está muito baixa.");
					System.out.println("Você precisa de no mínimo 10 de potência para esse movimento.");
					System.out.println("Sua potencia atual é de: " + potencia + " Por favor carregue seu robô: ");
					potencia = potencia + e.nextInt();
				}
				potencia = potencia - 10;
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
						while (potencia < 14) {
							System.out.println("Sua bateria está muito baixa.");
							System.out.println("Você precisa de no mínimo 14 de potência para esse movimento.");
							System.out.println("Sua potencia atual é de: " + potencia + " Por favor carregue seu robô: ");
							potencia = potencia + e.nextInt();
						}
						potencia = potencia - 14;
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
								while (potencia < 14) {
									System.out.println("Sua bateria está muito baixa.");
									System.out.println("Você precisa de no mínimo 14 de potência para esse movimento.");
									System.out.println("Sua potencia atual é de: " + potencia + " Por favor carregue seu robô: ");
									potencia = potencia + e.nextInt();
								}
								potencia = potencia - 14;
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
										while (potencia < 22) {
											System.out.println("Sua bateria está muito baixa.");
											System.out.println("Você precisa de no mínimo 22 de potência para esse movimento.");
											System.out.println("Sua potencia atual é de: " + potencia + " Por favor carregue seu robô: ");
											potencia = potencia + e.nextInt();	
										}
										potencia = potencia - 22;
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
												while (potencia < 16) {
													System.out.println("Sua bateria está muito baixa.");
													System.out.println("Você precisa de no mínimo 16 de potência para esse movimento.");
													System.out.println("Sua potencia atual é de: " + potencia + " Por favor carregue seu robô: ");
													potencia = potencia + e.nextInt();
												}
												potencia = potencia - 16;
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
														while (potencia < 16) {
															System.out.println("Sua bateria está muito baixa.");
															System.out.println("Você precisa de no mínimo 16 de potência para esse movimento.");
															System.out.println("Sua potencia atual é de: " + potencia + " Por favor carregue seu robô: ");
															potencia = potencia + e.nextInt();
														}
														potencia = potencia - 16;
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
																while (potencia < 6) {
																	System.out.println("Sua bateria está muito baixa.");
																	System.out.println("Você precisa de no mínimo 6 de potência para esse movimento.");
																	System.out.println("Sua potencia atual é de: " + potencia + " Por favor carregue seu robô: ");
																	potencia = potencia + e.nextInt();
																}
																potencia = potencia - 6;
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
