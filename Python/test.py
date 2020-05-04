def function(input_num):
    i = 0
    while i < input_num:
        i = i+1
        if input_num % i == 0 :
            print (i)

def function_list(input_list):
    print(min(input_list))

#input_num = 300001
input_list = (10,20,100,3)
#function(input_num) 
function_list(input_list[0])
