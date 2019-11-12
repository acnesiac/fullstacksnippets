class Node{
		constructor (data){
			this.data = data;
			this.left = null;
			this.rigth = null;
		}
		insert(data){
				if(data > this.data && this.rigth ){
					this.rigth.insert(data);
				}
				else if(data > this.data){
					this.rigth = new Node(data);
				}
				else if(data < this.data && this.left ){
					this.left.insert(data);
				}
				else if (data < this.data ){
					this.left = new Node(data);
				}
		}
		contains(data){
				if(data == this.data ){
					return data;
				}
				if (this.left.data > data && !this.left) {
					this.rigth.contains(data);
				}
				else{		
					this.left.contains(data);
				}
				return null;
		}
}