//Exemplo simples de Pipeline Declarative
pipeline{
	agent{ //Seção onde especifica onde todo o Pipeline, ou um estágio específico, será executado no ambiente Jenkins.
		label'pc' //Nesse caso meu agent será meu nó 'pc'
	}
	stages{ // É onde a maior parte do "trabalho" descrito por um Pipeline estará localizado. Dentro de um stages a varios stage.
		stage("Ex"){ //Defindo um dos estagios
			steps{//Seção onde define uma série de uma ou mais etapas a serem executadas.
				script{
				//Aqui como exemplo, podemos definir a parte onde será sincronizado o diretorio.
				}
			}
		}
	}
	stage("Ex2"){
		steps{
			script{
				//Aqui podemos definir algo como fazer um Build, dizendo oque o jenkins deverá fazer para atumatizar seu build.
			}
		}
	}
	stage("Ex3"){
		steps{
			script{
				//E aqui podemos definir algo do tipo, se precisamos mover algum arquivo de diretorio.
			}
		}
	}
}

//Nó: É uma maquina que faz parte do ambiente Jenkins.