.model small ; directive
.stack 100h  ; directive
.data

        n1 db 0Dh,'Input 1:$'
        n2 db 10,13, 'Input 2:$'
        n3 db 10,13, 'Input 3:$'
        n4 db 10,13, 'Input 4:$'

.code
    
    mov ah,02h  ; request to display character
    mov dl,4Eh  ; upper case letter N
    int 21h    
        
    mov ah,02h  ; request to display character
    mov dl,61h  ; lower case letter a
    int 21h
        
    mov ah,02h  ; request to display character
    mov dl,6Dh  ; lower case letter m
    int 21h      
        
    mov ah,02h  ; request to display character
    mov dl,65h  ; lower case letter e
    int 21h     
        
    mov ah,02h  ; request to display character
    mov dl,3Ah  ; :
    int 21h 
    
    mov ah,02h  ; request to display character
    mov dl,20h  ; Space
    int 21h   
    
    mov ah,02h  ; request to display character
    mov dl,52h  ; upper case letter R
    int 21h  
    
    mov ah,02h  ; request to display character
    mov dl,6Fh  ; lower case letter o
    int 21h 
        
    mov ah,02h  ; request to display character
    mov dl,6Eh  ; lower case letter n
    int 21h 
    
    mov ah,02h  ; request to display character
    mov dl,61h  ; lower case letter a
    int 21h
    
    mov ah,02h  ; request to display character
    mov dl,6Ch  ; lower case letter l
    int 21h
    
    mov ah,02h  ; request to display character
    mov dl,64h  ; lower case letter d
    int 21h
    
    mov ah,02h  ; request to display character
    mov dl,20h  ; Space 
    int 21h
    
    mov ah,02h  ; request to display character
    mov dl,4Dh  ; upper case letter M
    int 21h
    
    mov ah,02h  ; request to display character
    mov dl,61h  ; lower case letter a
    int 21h
    
    mov ah,02h  ; request to display character
    mov dl,73h  ; lower case letter s
    int 21h
    
    mov ah,02h  ; request to display character
    mov dl,68h  ; lower case letter h
    int 21h 
    
    mov ah,02h  ; request to display character
    mov dl,61h  ; lower case letter a
    int 21h 
    
    mov ah,02h  ; request to display character
    mov dl,76h  ; lower case letter v
    int 21h 
    
    mov ah,02h  ; request to display character
    mov dl,61h  ; lower case letter a
    int 21h 
    
    mov ah,02h  ; request to display character
    mov dl,09h  ; Tab
    int 21h
    
     
    mov ah,02h  ; request to display character
    mov dl,43h  ; upper case letter C
    int 21h 
    
    mov ah,02h  ; request to display character
    mov dl,2Fh  ; /
    int 21h  
    
    mov ah,02h  ; request to display character
    mov dl,59h  ; upper case letter Y
    int 21h
    mov ah,02h  ; request to display character
    mov dl,2Fh  ; /
    int 21h
    
    mov ah,02h  ; request to display character
    mov dl,53h  ; upper case letter S
    int 21h 
    
    mov ah,02h  ; request to display character
    mov dl,3Ah  ; :
    int 21h
    
    mov ah,02h  ; request to display character
    mov dl,20h  ; Space
    int 21h 
    
    mov ah,02h  ; request to display character
    mov dl,42h  ; upper case letter B
    int 21h 
    
    mov ah,02h  ; request to display character
    mov dl,43h  ; upper case letter C
    int 21h 
    
    mov ah,02h  ; request to display character
    mov dl,53h  ; upper case letter S
    int 21h 
    
    mov ah,02h  ; request to display character
    mov dl,33h  ; number 3
    int 21h 
    
    mov ah,02h  ; request to display character
    mov dl,33h  ; number 3
    int 21h 
    
    mov ah,02h  ; request to display character
    mov dl,0Ah  ; new line
    int 21h
    
    mov ah,02h  ; request to display character
    mov dl,0Ah  ; new line
    int 21h  
     
    
        mov ax,@data
        mov ds,ax
        
        
        ;first input 
        
        mov ah,09h          ; request input
        mov dx, offset n1
        int 21h
        
        mov ah,01h
        int 21h
        mov bl,al   
                
            ;first output
       
            mov ah,02   ;peform gotoxy
            mov dl,10   ;X-axis 
            mov dh,10   ;Y-axis
            mov bh,0    ;Page Number
            int 10h
              
            mov ah,02h  ; request to display character 
            mov dl,bl   ; first character
            int 21h

        ;second input 
        mov ah,02   ;peform gotoxy
        mov dl,10   ;X-axis 
        mov dh,02   ;Y-axis
        mov bh,0    ;Page Number
        int 10h  
        
        mov ah,09h          ; request input
        mov dx, offset n2
        int 21h
        
        mov ah,01h
        int 21h
        mov bl,al    
              
            ;second output
                
            mov ah,02   ;peform gotoxy 
            mov dl,50   ;X-axis
            mov dh,10   ;Y-axis
            mov bh,0    ;Page Number
            int 10h
            
            mov ah,02h   ; request to display character
            mov dl,bl    ; second character
            int 21h  

        ;third input         
        mov ah,02   ;peform gotoxy
        mov dl,10   ;X-axis 
        mov dh,03   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
                   
        mov ah,09h          ; request input
        mov dx, offset n3
        int 21h
        
        mov ah,01h
        int 21h
        mov bl,al    
               
            ;third output 
      
            mov ah,02    ;peform gotoxy
            mov dl,10    ;X-axis
            mov dh,20    ;Y-axis
            mov bh,0     ;Page Number
            int 10h
              
            mov ah,02h   ; request to display character
            mov dl,bl    ; third character
            int 21h
            
        ;forth input
        
        mov ah,02   ;peform gotoxy
        mov dl,10   ;X-axis 
        mov dh,04   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
                
        mov ah,09h          ; request input
        mov dx, offset n4
        int 21h
        
        mov ah,01h
        int 21h
        mov bl,al      
              
            ;forth output
       
            mov ah,02    ;peform gotoxy
            mov dl,50    ;X-axis
            mov dh,20    ;Y-axis
            mov bh,0     ;Page Number
            int 10h
            
            mov ah,02h   ; request to display character
            mov dl,bl    ; forth input 
            int 21h 
  
        mov ah,02h  ; request to display character
        mov dl,0Ah  ; new line
        int 21h
        
        mov ah,02h  ; request to display character
        mov dl,0Ah  ; new line
        int 21h 
        
        mov ah,02h  ; request to display character
        mov dl,0Dh  ; reset cursor
        int 21h 
            
           
       
    ;left border 
    
    mov ah,02   ;peform gotoxy
    mov dl,05   ;X-axis
    mov dh,09   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
     
    mov ah,02h  ; request to display character
    mov dl,179  ; vertical line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,05   ;X-axis
    mov dh,10   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
     
    mov ah,02h  ; request to display character
    mov dl,179  ; vertical line
    int 21h  
    
    mov ah,02   ;peform gotoxy
    mov dl,05   ;X-axis
    mov dh,11   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
     
    mov ah,02h  ; request to display character
    mov dl,179  ; vertical line
    int 21h 
    
    mov ah,02   ;peform gotoxy
    mov dl,05   ;X-axis
    mov dh,12   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
     
    mov ah,02h  ; request to display character
    mov dl,179  ; vertical line
    int 21h  
    
    mov ah,02   ;peform gotoxy
    mov dl,05   ;X-axis
    mov dh,13   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
     
    mov ah,02h  ; request to display character
    mov dl,179  ; vertical line
    int 21h  
    
    mov ah,02   ;peform gotoxy
    mov dl,05   ;X-axis
    mov dh,14   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
     
    mov ah,02h  ; request to display character
    mov dl,179  ; vertical line
    int 21h  
    
    mov ah,02   ;peform gotoxy
    mov dl,05   ;X-axis
    mov dh,15   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
     
    mov ah,02h  ; request to display character
    mov dl,179  ; vertical line
    int 21h  
    
    mov ah,02   ;peform gotoxy
    mov dl,05   ;X-axis
    mov dh,16   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
     
    mov ah,02h  ; request to display character
    mov dl,179  ; vertical line
    int 21h  
    
    mov ah,02   ;peform gotoxy
    mov dl,05   ;X-axis
    mov dh,17   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
     
    mov ah,02h  ; request to display character
    mov dl,179  ; vertical line
    int 21h  
    
    mov ah,02   ;peform gotoxy
    mov dl,05   ;X-axis
    mov dh,18   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
     
    mov ah,02h  ; request to display character
    mov dl,179  ; vertical line
    int 21h  
    
    mov ah,02   ;peform gotoxy
    mov dl,05   ;X-axis
    mov dh,19   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
     
    mov ah,02h  ; request to display character
    mov dl,179  ; vertical line
    int 21h  
    
    mov ah,02   ;peform gotoxy
    mov dl,05   ;X-axis
    mov dh,20   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
     
    mov ah,02h  ; request to display character
    mov dl,179  ; vertical line
    int 21h 
    
    mov ah,02   ;peform gotoxy
    mov dl,05   ;X-axis
    mov dh,21   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
     
    mov ah,02h  ; request to display character
    mov dl,179  ; vertical line
    int 21h  
          
          
        ; right boarder 
        
        mov ah,02   ;peform gotoxy
        mov dl,55   ;X-axis
        mov dh,09   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
         
        mov ah,02h  ; request to display character
        mov dl,179  ; vertical line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,55   ;X-axis
        mov dh,10   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
         
        mov ah,02h  ; request to display character
        mov dl,179  ; vertical line
        int 21h  
        
        mov ah,02   ;peform gotoxy
        mov dl,55   ;X-axis
        mov dh,11   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
         
        mov ah,02h  ; request to display character
        mov dl,179  ; vertical line
        int 21h 
        
        mov ah,02   ;peform gotoxy
        mov dl,55   ;X-axis
        mov dh,12   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
         
        mov ah,02h  ; request to display character
        mov dl,179  ; vertical line
        int 21h  
        
        mov ah,02   ;peform gotoxy
        mov dl,55   ;X-axis
        mov dh,13   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
         
        mov ah,02h  ; request to display character
        mov dl,179  ; vertical line
        int 21h  
        
        mov ah,02   ;peform gotoxy
        mov dl,55   ;X-axis
        mov dh,14   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
         
        mov ah,02h  ; request to display character
        mov dl,179  ; vertical line
        int 21h  
        
        mov ah,02   ;peform gotoxy
        mov dl,55   ;X-axis
        mov dh,15   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
         
        mov ah,02h  ; request to display character
        mov dl,179  ; vertical line
        int 21h  
        
        mov ah,02   ;peform gotoxy
        mov dl,55   ;X-axis
        mov dh,16   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
         
        mov ah,02h  ; request to display character
        mov dl,179  ; vertical line
        int 21h  
        
        mov ah,02   ;peform gotoxy
        mov dl,55   ;X-axis
        mov dh,17   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
         
        mov ah,02h  ; request to display character
        mov dl,179  ; vertical line
        int 21h  
        
        mov ah,02   ;peform gotoxy
        mov dl,55   ;X-axis
        mov dh,18   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
         
        mov ah,02h  ; request to display character
        mov dl,179  ; vertical line
        int 21h  
        
        mov ah,02   ;peform gotoxy
        mov dl,55   ;X-axis
        mov dh,19   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
         
        mov ah,02h  ; request to display character
        mov dl,179  ; vertical line
        int 21h  
        
        mov ah,02   ;peform gotoxy
        mov dl,55   ;X-axis
        mov dh,20   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
         
        mov ah,02h  ; request to display character
        mov dl,179  ; vertical line
        int 21h 
        
        mov ah,02   ;peform gotoxy
        mov dl,55   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
         
        mov ah,02h  ; request to display character
        mov dl,179  ; vertical line
        int 21h  
    
    
    ; top boarder
    
    mov ah,02   ;peform gotoxy
    mov dl,05   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,218  ; top left corner line
    int 21h

    mov ah,02   ;peform gotoxy
    mov dl,06   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,07   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,08   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,09   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,10   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,11   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,12   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,13   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,14   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,15   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,16   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,17   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,18   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,19   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,20   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,21   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,22   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,23   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,24   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,25   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h 
    
    mov ah,02   ;peform gotoxy
    mov dl,26   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h

    mov ah,02   ;peform gotoxy
    mov dl,27   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,28   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,29   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,30   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,31   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,32   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,33   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,34   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,35   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,36   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,37   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,38   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,39   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,40   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,41   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,42   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,43   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,44   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,45   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,46   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h 
    
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,47   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,48   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,49   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,50   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,51   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h 
    
    
    mov ah,02   ;peform gotoxy
    mov dl,52   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,53   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h
    
    mov ah,02   ;peform gotoxy
    mov dl,54   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,196  ; horizontal line
    int 21h 
    
    mov ah,02   ;peform gotoxy
    mov dl,55   ;X-axis
    mov dh,08   ;Y-axis
    mov bh,0    ;Page Number
    int 10h
 
    mov ah,02h  ; request to display character
    mov dl,191  ; top right corner line
    int 21h  
      
      
        ; bottom boarder
        
        mov ah,02   ;peform gotoxy
        mov dl,05   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,192  ; bottom left corner line
        int 21h
    
        mov ah,02   ;peform gotoxy
        mov dl,06   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,07   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,08   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,09   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,10   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,11   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,12   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,13   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,14   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,15   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,16   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,17   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,18   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,19   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,20   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,21   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,22   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,23   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,24   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,25   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h 
        
        mov ah,02   ;peform gotoxy
        mov dl,26   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
    
        mov ah,02   ;peform gotoxy
        mov dl,27   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,28   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,29   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,30   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,31   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,32   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,33   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,34   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,35   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,36   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,37   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,38   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,39   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,40   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,41   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,42   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,43   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,44   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,45   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,46   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h 
        
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,47   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,48   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,49   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,50   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,51   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h 
        
        
        mov ah,02   ;peform gotoxy
        mov dl,52   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,53   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h
        
        mov ah,02   ;peform gotoxy
        mov dl,54   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,196  ; horizontal line
        int 21h 
        
        mov ah,02   ;peform gotoxy
        mov dl,55   ;X-axis
        mov dh,21   ;Y-axis
        mov bh,0    ;Page Number
        int 10h
     
        mov ah,02h  ; request to display character
        mov dl,217  ; bottom right corner line
        int 21h
            
    mov ah,4ch
    int 21h
end




