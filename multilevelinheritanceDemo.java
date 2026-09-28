
// grand parent
class vehicle{

    void move(){
        system.out.println(x:"vehicle moves");
    }
} 
// parent(child of grand parent)
class truck extends vehicle{

}

// grand child
class motorcycle extends truck{

}