namespace LibSystem1
{
    partial class Ebooksissued
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.bOOKSISSUEDBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.libraryManagementDataSet = new LibSystem1.LibraryManagementDataSet();
            this.bOOKSISSUEDTableAdapter = new LibSystem1.LibraryManagementDataSetTableAdapters.BOOKSISSUEDTableAdapter();
            this.btnupdate = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.bOOKSISSUEDBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.libraryManagementDataSet)).BeginInit();
            this.SuspendLayout();
            // 
            // dataGridView1
            // 
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Location = new System.Drawing.Point(49, 12);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.Size = new System.Drawing.Size(600, 469);
            this.dataGridView1.TabIndex = 0;
            // 
            // bOOKSISSUEDBindingSource
            // 
            this.bOOKSISSUEDBindingSource.DataMember = "BOOKSISSUED";
            this.bOOKSISSUEDBindingSource.DataSource = this.libraryManagementDataSet;
            // 
            // libraryManagementDataSet
            // 
            this.libraryManagementDataSet.DataSetName = "LibraryManagementDataSet";
            this.libraryManagementDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // bOOKSISSUEDTableAdapter
            // 
            this.bOOKSISSUEDTableAdapter.ClearBeforeFill = true;
            // 
            // btnupdate
            // 
            this.btnupdate.Location = new System.Drawing.Point(588, 487);
            this.btnupdate.Name = "btnupdate";
            this.btnupdate.Size = new System.Drawing.Size(75, 23);
            this.btnupdate.TabIndex = 1;
            this.btnupdate.Text = "Update";
            this.btnupdate.UseVisualStyleBackColor = true;
            this.btnupdate.Click += new System.EventHandler(this.btnupdate_Click);
            // 
            // Ebooksissued
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(687, 576);
            this.Controls.Add(this.btnupdate);
            this.Controls.Add(this.dataGridView1);
            this.Name = "Ebooksissued";
            this.Text = "Ebooksissued";
            this.WindowState = System.Windows.Forms.FormWindowState.Maximized;
            this.Load += new System.EventHandler(this.Ebooksissued_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.bOOKSISSUEDBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.libraryManagementDataSet)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.DataGridView dataGridView1;
        private LibraryManagementDataSet libraryManagementDataSet;
        private System.Windows.Forms.BindingSource bOOKSISSUEDBindingSource;
        private LibraryManagementDataSetTableAdapters.BOOKSISSUEDTableAdapter bOOKSISSUEDTableAdapter;
        private System.Windows.Forms.Button btnupdate;
    }
}