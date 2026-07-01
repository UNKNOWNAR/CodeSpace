class Twitter {
    private static class Tweet{
        int id;
        int time;
        Tweet next;
        Tweet(int id, int time) {
            this.id = id;
            this.time = time;
            this.next = null;
        }
    }
    Map<Integer, Tweet> userTweets;
    int time;
    PriorityQueue<Integer> top10;//minHeap
    Map<Integer,ArrayList<Integer>> following;
    public Twitter() {
        time = 0;
        top10 = new PriorityQueue<>();
        userTweets = new HashMap<>();
        following = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        time++;
        Tweet newTweet = new Tweet(tweetId, time);
        if(userTweets.containsKey(userId))
            newTweet.next = userTweets.get(userId);
        userTweets.put(userId,newTweet);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Tweet> maxHeap = new PriorityQueue<>((a, b) -> b.time - a.time);
        // A. Add the user's own tweet head
        if (userTweets.containsKey(userId)) 
            maxHeap.add(userTweets.get(userId));
        
        // B. Add the tweet heads of everyone the user follows
        if (following.containsKey(userId)) {
            for (int followeeId : following.get(userId)) {
                Tweet t = userTweets.get(followeeId);
                if (t != null) {
                    maxHeap.offer(t);
                }
            }
        }
        // C. Extract top 10
        List<Integer> result = new ArrayList<>();
        while (!maxHeap.isEmpty() && result.size() < 10) {
            Tweet t = maxHeap.poll(); // Get newest
            result.add(t.id);
            
            // If this tweet has a previous one (next in list), add it to heap
            if (t.next != null) {
                maxHeap.offer(t.next);
            }
        }
        return result;
    }
    
    public void follow(int followerId, int followeeId) {
        if (!following.containsKey(followerId)) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(followeeId);
            following.put(followerId, list);
        } else {
            ArrayList<Integer> list = following.get(followerId);
            // FIX: Check for duplicates before adding!
            if (!list.contains(followeeId)) {
                list.add(followeeId);
            }
        }
    }
    
    public void unfollow(int followerId, int followeeId) {
        if (!following.containsKey(followerId)) return;
        
        ArrayList<Integer> list = following.get(followerId);
        
        // FIX: Use Integer.valueOf to remove by VALUE, not INDEX
        list.remove(Integer.valueOf(followeeId));
        
        if (list.isEmpty()) {
            following.remove(followerId);
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
