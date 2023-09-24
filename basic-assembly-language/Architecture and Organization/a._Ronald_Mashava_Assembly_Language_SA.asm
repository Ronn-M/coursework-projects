.model small                ; directive
.stack 100h                 ; directive
.data

        n1 db 0Dh,'Input 1:$'
        n2 db 10,13, 'Input 2:$'
        n3 db 10,13, 'Sum     :$'

.code
    
    mov ah,02h              ; request to display character
    mov dl,4Eh              ; upper case letter N
    int 21h    
        
    mov ah,02h              ; request to display character
    mov dl,61h              ; lower case letter a
    int 21h
        
    mov ah,02h              ; request to display character
    mov dl,6Dh              ; lower case letter m
    int 21h      
        
    mov ah,02h              ; request to display character
    mov dl,65h              ; lower case letter e
    int 21h     
        
    mov ah,02h              ; request to display character
    mov dl,3Ah              ; :
    int 21h 
    
    mov ah,02h              ; request to display character
    mov dl,20h              ; Space
    int 21h         
    
    mov ah,02h              ; request to display character
    mov dl,52h              ; upper case letter R
    int 21h  
    
    mov ah,02h              ; request to display character
    mov dl,6Fh              ; lower case letter o
    int 21h 
        
    mov ah,02h              ; request to display character
    mov dl,6Eh              ; lower case letter n
    int 21h 
    
    mov ah,02h              ; request to display character
    mov dl,61h              ; lower case letter a
    int 21h
    
    mov ah,02h              ; request to display character
    mov dl,6Ch              ; lower case letter l
    int 21h
    
    mov ah,02h              ; request to display character
    mov dl,64h              ; lower case letter d
    int 21h
    
    mov ah,02h              ; request to display character
    mov dl,20h              ; Space 
    int 21h
    
    mov ah,02h              ; request to display character
    mov dl,4Dh              ; upper case letter M
    int 21h
    
    mov ah,02h              ; request to display character
    mov dl,61h              ; lower case letter a
    int 21h
    
    mov ah,02h              ; request to display character
    mov dl,73h              ; lower case letter s
    int 21h         
    
    mov ah,02h              ; request to display character
    mov dl,68h              ; lower case letter h
    int 21h 
    
    mov ah,02h              ; request to display character
    mov dl,61h              ; lower case letter a
    int 21h 
    
    mov ah,02h              ; request to display character
    mov dl,76h              ; lower case letter v
    int 21h 
    
    mov ah,02h              ; request to display character
    mov dl,61h              ; lower case letter a
    int 21h 
    
    mov ah,02h              ; request to display character
    mov dl,09h              ; Tab
    int 21h
    
     
    mov ah,02h              ; request to display character
    mov dl,43h              ; upper case letter C
    int 21h 
    
    mov ah,02h              ; request to display character
    mov dl,2Fh              ; /
    int 21h  
    
    mov ah,02h              ; request to display character
    mov dl,59h              ; upper case letter Y
    int 21h
    mov ah,02h              ; request to display character
    mov dl,2Fh              ; /
    int 21h
    
    mov ah,02h              ; request to display character
    mov dl,53h              ; upper case letter S
    int 21h 
    
    mov ah,02h              ; request to display character
    mov dl,3Ah              ; :
    int 21h
    
    mov ah,02h              ; request to display character
    mov dl,20h              ; Space
    int 21h 
    
    mov ah,02h              ; request to display character
    mov dl,42h              ; upper case letter B
    int 21h 
    
    mov ah,02h              ; request to display character
    mov dl,43h              ; upper case letter C
    int 21h 
    
    mov ah,02h              ; request to display character
    mov dl,53h              ; upper case letter S
    int 21h 
    
    mov ah,02h              ; request to display character
    mov dl,33h              ; number 3
    int 21h         
    
    mov ah,02h              ; request to display character
    mov dl,33h              ; number 3
    int 21h 
    
    mov ah,02h              ; request to display character
    mov dl,0Ah              ; new line
    int 21h
    
    mov ah,02h              ; request to display character
    mov dl,0Ah              ; new line
    int 21h         
     
    
        mov ax,@data
        mov ds,ax
        
        ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
        
        ;first input 
        
        mov ah,09h          ; request input
        mov dx, offset n1
        int 21h
        
        mov ah,01h
        int 21h
        sub al,30h
        mov bh,al 
               
        
        ;Second input
        
        mov ah,09h          ; request input
        mov dx, offset n2
        int 21h
        
        mov ah,01h
        int 21h
        sub al,30h
        mov bl,al    
          
        mov ax,0
        mov al,bh    
        add al,bl
        aaa
        mov ch,ah
        mov cl,al
        
        
        mov ah,02h              ; request to display character
        mov dl,0Ah              ; new line
        int 21h
      
        mov ah,09h          ; request to display character   
        mov dx, offset n3
        int 21h
        
        add ch,30h
        mov ah,02h          ; request to display character     
        mov dl,ch           ; add result
        int 21h 
        
        add cl,30h
        mov ah,02h          ; request to display character     
        mov dl,cl           ; add result
        int 21h


    mov ah,4ch
    int 21h
end