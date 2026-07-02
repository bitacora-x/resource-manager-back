package com.bitacorax.resourcemanagerback.controller

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@SpringBootTest
@AutoConfigureMockMvc
class HealthCheckControllerTest(
    @Autowired val mockMvc: MockMvc,
) {
    @Test
    fun testHealthCheckRequest() {
        mockMvc
            .perform(get("/health"))
            .andExpect(status().isOk)
    }
}
