//sets up the canvas for drawing
canvas = document.getElementById("animation");
ctx = canvas.getContext('2d');

//sets the dimensions of the draw screen
canvas.width = window.innerWidth;
canvas.height = window.innerHeight;

//gravity given to confetti every frame
gravity = 0.1;

//colors that confetti can be
colors = ["red","orange","yellow","green","blue"];

//class that makes confetti and updates it
class square {
	//runs on creation
	constructor() {
		this.color = colors[Math.round((Math.random()*(colors.length-1)))];
		this.angle = Math.random()*Math.PI;

		//positional variables
		this.x = canvas.width/2;
		this.y = 0;
		this.v = Math.random()*4;
		this.v_x = Math.cos(this.angle)*this.v;
		this.v_y = Math.sin(this.angle)*this.v;
		this.size = 20;
		this.r = 0.1;
		this.v_r = Math.random()*0.2-0.1;

		this.active = true;
	}
	
	//draws the confetti every frame
	draw() {
		//setup for the draw variables
		ctx.fillStyle = this.color;

		//draws the confetti
		ctx.setTransform(Math.cos(this.r), Math.sin(this.r), -Math.sin(this.r), Math.cos(this.r), this.x, this.y);
		ctx.fillRect(0,0,this.size,this.size);

		//resets the view
		ctx.setTransform(1, 0, 0, 1, 0, 0);
	}

	//runs every frame
	update() {
		if (this.active) {
			//updates the position variables
			this.r+=this.v_r;
			this.v_y+=gravity;
			this.x+=this.v_x;
			this.y+=this.v_y;

			//checks if the confetti is still on the screen
			if (this.y>window.innerHeight) {
				this.active = false;
			}

			//draws the confetti to the screen
			this.draw();
		}
	}
};

//runs every frame
function draw() {
	//clears the screen
	ctx.clearRect(0, 0, canvas.width, canvas.height);

	//draws all the confetti
	for (i=0;i<squares.length;i++) {
		squares[i].update();
	}

	//calls another window update
	window.requestAnimationFrame(draw);
}
squares = [];
draw();
