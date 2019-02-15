package com.manning.readinglist;

import static org.hamcrest.Matchers.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author 王禹展 wyuzhan@163.com
 * @date 2019/2/15  17:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MockMvcWebTests {
    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setupMockMvc(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void homePage() throws Exception{
        mockMvc.perform(get("/readingList/craig"))
                .andExpect(status().isOk())
                .andExpect(view().name("readingList"))
                .andExpect(model().attributeExists("books"))
                .andExpect(model().attribute("books",
                       is(empty())));
    }

    @Test
    public void postBook() throws Exception{
        mockMvc.perform(post("/readingList/craig")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("title", "BOOK TITLE")
                .param("author", "BOOK author")
                .param("isbn", "CN1223321DD12")
                .param("description", "this book has been made a movie"))
                .andExpect(status().is3xxRedirection())
                .andExpect(header().string("Location", "/readingList/craig"));
        Book book = new Book();
        book.setId(1L);
        book.setReader("craig");
        book.setTitle("BOOK TITLE");
        book.setAuthor("BOOK author");
        book.setIsbn("CN1223321DD12");
        book.setDescription("this book has been made a movie");

        mockMvc.perform(get("/readingList/craig"))
                .andExpect(status().isOk())
                .andExpect(view().name("readingList"))
                .andExpect(model().attributeExists("books"))
                .andExpect(model().attribute("books", hasSize(1)))
                .andExpect(model().attribute("books", contains(samePropertyValuesAs(book))));
    }
}
