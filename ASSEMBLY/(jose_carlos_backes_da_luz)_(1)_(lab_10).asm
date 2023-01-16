.data
	mensagem: .asciiz "A soma é: "
.text
	li $t1, 3
	li $t2, 6
	add $t0, $t1, $t2
	li $v0, 4
	la $a0, mensagem
	syscall
	move $a0, $t0
	li $v0,1
	syscall
	
	
	