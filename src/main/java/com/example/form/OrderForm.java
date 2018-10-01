package com.example.form;

import com.example.form.common.BasePageForm;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderForm extends BasePageForm {

  private Integer userId;

  private String zip;
}
