def groovyUtils = new com.eviware.soapui.support.GroovyUtils(context)

// gerar um cpf valido
def cpfGerado 

def n = 9
def n1 =  Math.round(Math.random()*n)
def n2 =  Math.round(Math.random()*n)
def n3 =  Math.round(Math.random()*n)
def n4 =  Math.round(Math.random()*n)
def n5 =  Math.round(Math.random()*n)
def n6 = Math.round(Math.random()*n)
def n7 = Math.round(Math.random()*n)
def n8 =  Math.round(Math.random()*n)
def n9 = Math.round(Math.random()*n)

def d1 = n9*2+n8*3+n7*4+n6*5+n5*6+n4*7+n3*8+n2*9+n1*10

d1 =  11 - ( Math.round(d1 - (Math.floor(d1/11)*11)))

 if (d1>=10) d1 = 0
 
def d2 = d1*2+n9*3+n8*4+n7*5+n6*6+n5*7+n4*8+n3*9+n2*10+n1*11

d2 =  11 - ( Math.round(d2 - (Math.floor(d2/11)*11)))

if (d2>=10) d2 = 0

cpfGerado =  ""+n1+n2+n3+n4+n5+n6+n7+n8+n9+d1+d2

println ( cpfGerado )

testRunner.testCase.setPropertyValue("cpf",cpfGerado) 