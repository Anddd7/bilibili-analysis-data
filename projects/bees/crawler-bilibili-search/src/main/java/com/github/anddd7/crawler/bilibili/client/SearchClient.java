package com.github.anddd7.crawler.bilibili.client;

import com.github.anddd7.crawler.bilibili.client.response.SearchDataWrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "bilibili-get", url = "https://s.search.bilibili.com")
public interface SearchClient {

  /**
   * Bilibili视频按时间排列
   */
  @GetMapping("/cate/search")
  SearchDataWrapper search(
      @RequestParam("main_ver") String mainVersion,
      @RequestParam("search_type") String searchType,
      @RequestParam("view_type") String viewType,
      @RequestParam("pic_size") String pictureSize,
      @RequestParam("order") String order,
      @RequestParam("copy_right") int copyRight,
      @RequestParam("pagesize") int pageSize,
      @RequestParam("page") int pageNumber,
      @RequestParam("cate_id") int categoryId,
      @RequestParam("time_from") String dateFrom,
      @RequestParam("time_to") String dateTo);
}
