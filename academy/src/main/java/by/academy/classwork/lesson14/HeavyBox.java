package by.academy.classwork.lesson14;

public class HeavyBox implements Comparable<HeavyBox> {
	private int weight;
	 public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + depth;
		result = prime * result + height;
		result = prime * result + weight;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HeavyBox other = (HeavyBox) obj;
		if (depth != other.depth)
			return false;
		if (height != other.height)
			return false;
		if (weight != other.weight)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	private int width;
	 private int height;
	 private int depth;

	 public HeavyBox(int w, int h, int d, int m) {
	  width = w;
	  height = h;
	  depth = d;
	  weight = m;
	 }

	 public int compareTo(HeavyBox hb) {
	  return -(weight - hb.weight);
	 }

	 @Override
	 public String toString() {
	  StringBuilder builder = new StringBuilder();
	  builder.append("HeavyBox [weight=");
	  builder.append(weight);
	  builder.append(", width=");
	  builder.append(width);
	  builder.append(", height=");
	  builder.append(height);
	  builder.append(", depth=");
	  builder.append(depth);
	  builder.append("]");
	  return builder.toString();
	 }

}
