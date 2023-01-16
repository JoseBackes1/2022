.data
	titulo: .asciiz "BEM VINDO AO CALCULADOR DE FATORIAL"
	msn1: .asciiz "\nInforme um numero Natural maior ou igual a 1: "
	msn2: .asciiz "O Fatorial do numero escolhido é " 
	msnErro: .asciiz "Número digitado inválido!"
.text
	j printTitulo 
	main:
		li $t0, 1 #esse é o fatorial, é iniciado em 1 pois é o elemento neutro da multiplicacao
		j scan #pula para ler o numero
	ifErro: #testa se o numero digitado pelo usuario é válido
		blt $t1, 1, printErro #if(n<1)
		j ifFat #else
	ifFat: #if do calculo de fatorial
		bge $t1, 1, fat # if(n>= 1)
		j printResultado#else
	fat: #aqui calcula o fatorial F= n * F(n-1)
		mul $t0, $t0, $t1# F= F*n
		sub $t1, $t1, 1 #(n-1)
		j ifFat 
	scan: #essa parte é aonde pega o numero digitado pelo usuario
		li $v0, 4 #comando para imprimir mensagem
		la $a0, msn1# imprime a mensagem1
		syscall
		li $v0, 5#pega o que é digitado e guarda em $v0
		syscall
		move $t1, $v0 #$t1 seria o n
		j ifErro
	printTitulo: #printa o titulo do programa
		li $v0, 4
		la $a0, titulo# imprime titulo
		syscall	
		j main	
	printResultado:
		li $v0, 4
		la $a0, msn2# imprime a mensagem2
		syscall	
		li $v0, 1#comando para imprimir um inteiro
		move $a0, $t0
		syscall
		j fim
	printErro:
		li $v0, 4
		la $a0, msnErro# imprime a mensagem de erro
		syscall
		j scan
	fim:
		li $v0, 10
		syscall							
														