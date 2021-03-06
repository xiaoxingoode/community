package life.majiang.community.advice;

import com.alibaba.fastjson.JSON;
import life.majiang.community.dto.ResultDTO;
import life.majiang.community.exception.CustomizeErrorCode;
import life.majiang.community.exception.CustomizeException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@ControllerAdvice
public class CustomizeExceptionHandler {
//    @ExceptionHandler(Exception.class)
//    ModelAndView handle(HttpServletRequest request, Throwable e, Model model, HttpServletResponse response){
//        String contentType = request.getContentType();
//        //如果获取到的contentType等于 application/json 返回json
//        if("application/json".equals(contentType)){
//            ResultDTO resultDTO;
//            if(e instanceof CustomizeException){
//                resultDTO= ResultDTO.errorOf((CustomizeException) e);
//            }else {
//                resultDTO= ResultDTO.errorOf(CustomizeErrorCode.SYS_ERROR);
//            }
//            try {
//                response.setContentType("application/json");
//                System.out.println(111);
//                response.setCharacterEncoding("utf-8");
//                response.setStatus(200);
//                PrintWriter writer=response.getWriter();
//                writer.write(JSON.toJSONString(resultDTO));
//                writer.close();
//            } catch (IOException ioe) {
//            }
//            return null;
//        }else {
//            // 错误页面跳转
//            if(e instanceof CustomizeException){
//                model.addAttribute("message",e.getMessage());
//            }else {
//                model.addAttribute("message",CustomizeErrorCode.SYS_ERROR.getMessage());
//            }
//            return new ModelAndView("error.html");
//        }
//    }
}
