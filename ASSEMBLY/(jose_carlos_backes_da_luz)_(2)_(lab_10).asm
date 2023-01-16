.text
	li $v0, 5#pega o que é digitado e guarda em $v0
	syscall
	move $s0, $v0 #o conteude de $v0 é movido para $s0
	li $v0, 4
	la $a0, mensagem# imprime a mensagem
	syscall
	li $v0, 1#comando para imprimir um inteiro
	move $a0, $s0
	syscall
.data
	mensagem: .asciiz "voce digitou: "
