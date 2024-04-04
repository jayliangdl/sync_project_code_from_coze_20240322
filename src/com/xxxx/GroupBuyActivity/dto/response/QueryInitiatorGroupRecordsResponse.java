package com.xxxx.GroupBuyActivity.dto.response;

import lombok.Data;

@Data
public class QueryInitiatorGroupRecordsResponse {
    private List<GroupRecord> groupRecords;
    
    @Data
    public static class GroupRecord {
        private String groupId;
        private String activityId;
        private String initiatorId;
        private String createTime;
        private List<Member> members;
        
        @Data
        public static class Member {
            private String memberId;
            private String memberName;
            private String joinTime;
        }
    }
}