package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CloudVendor;

@RestController
@RequestMapping("/details")
public class CloudVendorAPIService {
		
	         CloudVendor cloudVendor;
			@GetMapping("{vendorId}")
			
			public CloudVendor getCloudVendordetails(String vendorId) {
				
							return cloudVendor;
//									new CloudVendor("C1", " Vendor 1", "Address one","xxxx1");
				
			}	
			
				@PostMapping
				public String postCloudVendordetails(@RequestBody CloudVendor cloudVendor)		
				{
					this.cloudVendor = cloudVendor;
				return "Cloud Vendor Created Successfully";
				}
				@PutMapping
				public String updateCloudVendordetails(@RequestBody CloudVendor cloudVendor)
				
				{
					this.cloudVendor = cloudVendor;
				return "Cloud Vendor updated Successfully";
				}
				@DeleteMapping
				public String  deleteCloudVendordetails(@RequestBody  String vendorId)
				{
					this.cloudVendor = null;
					return "Cloud Vendor deleted Successfully";
				}
			}
	






































	
//         CloudVendor cloudVendor;
//		@GetMapping("{vendorId}")
//		
//		public CloudVendor getCloudVendordetails(String vendorId) {
//			
//						return cloudVendor;
//								/*new CloudVendor("C1", " Vendor 1", "Address one","xxxx1");*/
//			
//		}
//			@PostMapping
//			public String postCloudVendordetails(@RequestBody CloudVendor cloudVendor)		
//			{
//				this.cloudVendor = cloudVendor;
//			return "Cloud Vendor Created Successfully";
//			}
//			@PutMapping
//			public String updateCloudVendordetails(@RequestBody CloudVendor cloudVendor)
//			
//			{
//				this.cloudVendor = cloudVendor;
//			return "Cloud Vendor updated Successfully";
//			}
//			@DeleteMapping
//			public String  deleteCloudVendordetails(@RequestBody  String vendorId)
//			{
//				this.cloudVendor = null;
//				return "Cloud Vendor deleted Successfully";
//			}
//		}
//		
//
//
