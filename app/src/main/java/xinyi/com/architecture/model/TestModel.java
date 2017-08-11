package xinyi.com.architecture.model;

import java.util.List;

/**
 * Created by wxy on 2017/8/8.
 */

public class TestModel {

	/**
	 * date : 20170808
	 * stories : [{"images":["https://pic3.zhimg.com/v2-dfccb03142a4c15e7653c753f624447a.jpg"],"type":0,"id":9546802,"ga_prefix":"080814","title":"iPod 陪我走过了 16 年，但它的时代算是彻底结束了"},{"images":["https://pic2.zhimg.com/v2-c77e26f5a7a51037c6468f07a5b7b489.jpg"],"type":0,"id":9561726,"ga_prefix":"080813","title":"豆瓣要上市，豆瓣要挣钱，豆瓣怎么办？"},{"images":["https://pic3.zhimg.com/v2-477817c285a6076f26cbeb660527398e.jpg"],"type":0,"id":9560604,"ga_prefix":"080812","title":"大误 · 吃电话号码的家伙"},{"images":["https://pic2.zhimg.com/v2-1a457e45f6e1858e2ed706f167fe8125.jpg"],"type":0,"id":9561708,"ga_prefix":"080811","title":"《战狼 2》的票房是一场心照不宣的游戏，观众默契地想往大里整"},{"images":["https://pic2.zhimg.com/v2-f01f6f7e7ab5f2106e9fc3868266e9dd.jpg"],"type":0,"id":9561185,"ga_prefix":"080810","title":"这些经典的面试题大家都知道，为什么还是答不好？"},{"images":["https://pic2.zhimg.com/v2-f406330445555f249c2d154c241f1dc1.jpg"],"type":0,"id":9558269,"ga_prefix":"080809","title":"如果把一家互联网公司比作餐馆，那在座的各位就是\u2026\u2026"},{"images":["https://pic4.zhimg.com/v2-7d875cebee5c3d250ea3c2e7fab4bd23.jpg"],"type":0,"id":9561144,"ga_prefix":"080808","title":"图便宜买过境港澳的机票，结果花了钱还糟心"},{"images":["https://pic3.zhimg.com/v2-cc53d1d49e61bfb96d8e617e2912ed4a.jpg"],"type":0,"id":9561176,"ga_prefix":"080807","title":"特斯拉之所以成功，最重要的是做到了这一点"},{"images":["https://pic2.zhimg.com/v2-08819f52870c4b29c4f9dea93154b00d.jpg"],"type":0,"id":9560483,"ga_prefix":"080807","title":"你看，又有「专家」拿地震云来忽悠人了"},{"images":["https://pic3.zhimg.com/v2-0a6f4c29c3e306b0e88bc614ad3703f6.jpg"],"type":0,"id":9560787,"ga_prefix":"080807","title":"3 镜片还是 4 镜片？选错了，可能影响中国天文几十年"},{"images":["https://pic4.zhimg.com/v2-db01afd8d27d26f02086b4fefdaa687f.jpg"],"type":0,"id":9559207,"ga_prefix":"080806","title":"瞎扯 · 如何正确地吐槽"},{"images":["https://pic4.zhimg.com/v2-3f15419bad4a523f8f5186a1ff71bc6b.jpg"],"type":0,"id":9551885,"ga_prefix":"080806","title":"这里是广告 · 完美求婚作战，你只差这一枚钻戒"}]
	 * top_stories : [{"image":"https://pic4.zhimg.com/v2-d716c75ddc48584d66594d8a52f26a3b.jpg","type":0,"id":9561708,"ga_prefix":"080811","title":"《战狼 2》的票房是一场心照不宣的游戏，观众默契地想往大里整"},{"image":"https://pic2.zhimg.com/v2-79255d76b3334df162fd4b484cd7d88d.jpg","type":0,"id":9561144,"ga_prefix":"080808","title":"图便宜买过境港澳的机票，结果花了钱还糟心"},{"image":"https://pic2.zhimg.com/v2-a2f6c6428d3edf6ac11a4e5e74aa9ced.jpg","type":0,"id":9560483,"ga_prefix":"080807","title":"你看，又有「专家」拿地震云来忽悠人了"},{"image":"https://pic2.zhimg.com/v2-cbf773f2d611633e49b5ad516f0931a9.jpg","type":0,"id":9560787,"ga_prefix":"080807","title":"3 镜片还是 4 镜片？选错了，可能影响中国天文几十年"},{"image":"https://pic1.zhimg.com/v2-c7a203de0c6a6d451d44ad1a415cc6b0.jpg","type":0,"id":9560543,"ga_prefix":"080717","title":"对于嘲讽对手的行为，只能说「电子竞技不相信眼泪」"}]
	 */

	private String date;
	private List<StoriesBean> stories;
	private List<TopStoriesBean> top_stories;

	public String getDate() { return date;}

	public void setDate(String date) { this.date = date;}

	public List<StoriesBean> getStories() { return stories;}

	public void setStories(List<StoriesBean> stories) { this.stories = stories;}

	public List<TopStoriesBean> getTop_stories() { return top_stories;}

	public void setTop_stories(List<TopStoriesBean> top_stories) { this.top_stories = top_stories;}

	public static class StoriesBean {
		/**
		 * images : ["https://pic3.zhimg.com/v2-dfccb03142a4c15e7653c753f624447a.jpg"]
		 * type : 0
		 * id : 9546802
		 * ga_prefix : 080814
		 * title : iPod 陪我走过了 16 年，但它的时代算是彻底结束了
		 */

		private int type;
		private int id;
		private String ga_prefix;
		private String title;
		private List<String> images;

		public int getType() { return type;}

		public void setType(int type) { this.type = type;}

		public int getId() { return id;}

		public void setId(int id) { this.id = id;}

		public String getGa_prefix() { return ga_prefix;}

		public void setGa_prefix(String ga_prefix) { this.ga_prefix = ga_prefix;}

		public String getTitle() { return title;}

		public void setTitle(String title) { this.title = title;}

		public List<String> getImages() { return images;}

		public void setImages(List<String> images) { this.images = images;}
	}

	public static class TopStoriesBean {
		/**
		 * image : https://pic4.zhimg.com/v2-d716c75ddc48584d66594d8a52f26a3b.jpg
		 * type : 0
		 * id : 9561708
		 * ga_prefix : 080811
		 * title : 《战狼 2》的票房是一场心照不宣的游戏，观众默契地想往大里整
		 */

		private String image;
		private int type;
		private int id;
		private String ga_prefix;
		private String title;

		public String getImage() { return image;}

		public void setImage(String image) { this.image = image;}

		public int getType() { return type;}

		public void setType(int type) { this.type = type;}

		public int getId() { return id;}

		public void setId(int id) { this.id = id;}

		public String getGa_prefix() { return ga_prefix;}

		public void setGa_prefix(String ga_prefix) { this.ga_prefix = ga_prefix;}

		public String getTitle() { return title;}

		public void setTitle(String title) { this.title = title;}
	}
}
