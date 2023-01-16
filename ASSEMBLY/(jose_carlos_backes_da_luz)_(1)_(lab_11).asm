.text
main:
	#bloco de impressao da primeira mensagem
	li $v0, 4
	la $a0, msn_1
	syscall
	#pega o valor de x e guarda em v0
	li $v0, 5
	syscall
	#guarda o valor de v0 em s0
	move $t0, $v0#s0 guarda o x, é a partir daqui que vamos fazer as contas
	syscall
	mul $t1, $t0, $t0
	mul $t2, $t1, 5
	#agora iremos operar o elemento B da equacao utilizando o t3
	mul $t3, $t0, 2
	#agora vamos efetuar as somas, usando t0 como o acumulador e depois somar com o 3
	add $t0, $t2, $t3
	add $t0, $t0, 3
	#imprime a segunda mensagem
	li $v0, 4
	la $a0, msn_2
	syscall
	#imprime o numero
	li $v0, 1
	move $a0, $t0 #move o conteudo de t0 em a0
	syscall
.data
	msn_1: .asciiz "Entre com o valor de x: "
	msn_2: .asciiz "O resultado é: "